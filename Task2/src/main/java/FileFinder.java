import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class FileFinder {

    private int BUF_SIZE = 33554432;
    private static int DIR_MODE = 1;
    private static int FILE_MODE = 2;
    private static int DEFAULT_MODE = 0;

    public static void main(String[] args) {
        FileFinder fileFinder = new FileFinder();

        if (args.length == 3) {
            int mode;
            switch (args[0]) {
                case "--name": {
                    mode = DIR_MODE;
                    break;
                }

                case "--data": {
                    mode = FILE_MODE;
                    break;
                }

                default: {
                    mode = DEFAULT_MODE;
                }
            }

            long startTime = System.currentTimeMillis();
            HashMap<File, Long> result = fileFinder.findFiles(args[1], args[2], mode);
            long stopTime = System.currentTimeMillis();
            if (result.size() == 0) {
                System.out.println("Search didn't match any file :(");
            } else {
                for (Map.Entry<File, Long> elem : result.entrySet()) {
                    System.out.print(elem.getKey().getAbsolutePath() + "\\" + elem.getKey().getName() + "\t");
                    System.out.println("position:" + elem.getValue());
                }
            }
            System.out.println("Took time: " + (stopTime - startTime) / (double) 1000 + " sec");

        } else {
            System.out.println("usage: java -jar [path-to-jar]/Task2.jar [--name \"<text>\" <folder>] \n" +
                    "           [--date \"<substring>\" <folder|file>] \n" +
                    "           [-h] \n" +
                    "\n" +
                    "\'--name\' option search file(s) by name in specified directory recursively\n" +
                    "\'--data\' option search substring in file(s)'s content in specified directory or file \n");
        }

    }

    private HashMap<File, Long> findFiles(String text, String directoryOrFileAbsoluteName, int mode){
        if (text == null) {
            throw new IllegalArgumentException("Can't search substring without substring");
        }
        File source = new File(directoryOrFileAbsoluteName);
        HashMap<File, Long> result = new HashMap<>();
        searchFile(text, source, result, mode);
        return result;
    }

    private void searchFile(String text, File root, HashMap<File, Long> result, int mode) {
        if (root == null || !root.exists()) {
            throw new IllegalArgumentException("Can't search substring in non-existent file");
        } else if (root.isDirectory() && root.listFiles() != null) {
            for (File file : root.listFiles()) {
                if (file.isDirectory()) {
                    searchFile(text, file, result, mode);
                } else {
                    if(mode == DIR_MODE){
                        long matchIndex;
                        if ((matchIndex = file.getName().indexOf(text)) > 0) {
                            result.put(file, matchIndex);
                        }
                    } else if(mode == FILE_MODE){
                        findSubstring(file, result, text);
                    }
                }
            }
        } else if (root.isFile()){
            findSubstring(root, result, text);
        }
    }

    private void findSubstring(File file, HashMap<File, Long> result, String substring){
        try (FileReader reader = new FileReader(file.getAbsolutePath())) {
            long position;
            if ((position = searchSubstringInFile(substring, reader)) > 0) {
                result.put(new File(file.getName()), position);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException ex){
            System.out.println(file.getAbsolutePath());
        }
    }

    private long searchSubstringInFile(String substring, FileReader reader) throws IOException {
        CharBuffer buffer = CharBuffer.allocate(BUF_SIZE);
        long index = 0;
        while ((reader.read(buffer)) > 0) {
            if (buffer.hasRemaining()) {
                buffer.flip();
            }
            buffer.rewind();
            int matchIndex;
            //if ((matchIndex = buffer.toString().indexOf(substring)) > 0) {
            if ((matchIndex = BoyerMooreHorspoolSearch(substring, buffer.toString())) > 0) {
            //if ((matchIndex = ApostolicoCrochemoreSearch(substring.toCharArray(), buffer.toString().toCharArray())) > 0) {
                index += matchIndex;
                return index;
            } else if (buffer.limit() == BUF_SIZE) {
                char[] residue = new char[substring.length()];
                int shift = BUF_SIZE - substring.length();
                if(shift < 0) {
                    shift = 0;
                }
                buffer.position(shift);
                buffer.get(residue);
                buffer.rewind();
                buffer.put(residue);
                index -= substring.length();

            }
            index += BUF_SIZE;
        }
        return -1;
    }

    private void getT(char[] pattern, int[] t) {
        int i = 0;
        int j = t[0] = -1;
        while (i < pattern.length) {
            while (j > -1 && pattern[i] != pattern[j]) {
                j = t[j];
            }
            ++i;
            ++j;
            if (i < pattern.length && pattern[i] == pattern[j]) {
                t[i] = t[j];
            } else {
                t[i] = j;
            }
        }
    }

    private int ApostolicoCrochemoreSearch(char[] pattern, char[] text) {
        int l;
        int[] t = new int[pattern.length + 1];

        //preprocessing
        getT(pattern, t);

        //counting l value
        for (l = 1; pattern[l - 1] == pattern[l]; l++) ;
        if (l == pattern.length) {
            l = 0;
        }

        //searching
        int i = l;
        int j = 0;
        int k = 0;
        int pattern_length = pattern.length;
        int text_length = text.length;
        while (j <= text_length - pattern_length) {
            while (i < pattern_length && pattern[i] == text[i + j]) {  // if x[i]=y[i+j]
                ++i;                                                   // then next triple (i+1,j,k)
            }
            if (i >= pattern_length) {
                while (k < l && pattern[k] == text[j + k]) {           // if k<l и x[k]=y[j+k]
                    ++k;                                               // then next triple (i,j,k+1)
                }
                if (k >= l) {                                          // if k=l
                    return j;                                         // then found substring in position j
                }
            }
            j += (i - t[i]);                                           //count next shift
            if (i == l) {
                k = Math.max(0, k - 1);                                // if i=l и x[i]≠y[i+j], then next triple (l,j+1,max(0,k−1))
            } else {
                if (t[i] <= l) {                                       // if t[i]⩽l, then next triple (l,i+j−t[i],max(0,t[i]))
                    k = Math.max(0, t[i]);
                    i = l;
                } else {
                    k = l;
                    i = t[i];
                }
            }
        }

        return -1;

    }

    private int BoyerMooreHorspoolSearch(String pattern, String text) {
        int patternLength = pattern.length();
        int textLength = text.length();
        if (patternLength > textLength) {
            return -1;
        }
        HashMap<Character, Integer> offsetTable = new HashMap<>();
        for (int i = 0; i <= 255; i++) {
            offsetTable.put((char) i, patternLength);
        }
        for (int i = 0; i < patternLength - 1; i++) {
            offsetTable.put(pattern.charAt(i), patternLength - i - 1);
        }
        int j;
        int k;
        int i = j = k = patternLength - 1;
        while (j >= 0 && i <= textLength - 1) {
            j = patternLength - 1;
            k = i;
            while (j >= 0 && text.charAt(k) == pattern.charAt(j)) {
                k--;
                j--;
            }
            i += offsetTable.get(text.charAt(i));
        }
        if (k >= textLength - patternLength) {
            return -1;
        } else {
            return k + 1;
        }
    }

}
