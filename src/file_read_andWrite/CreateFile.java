package file_read_andWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        String [] strings=new String[]{"barış","savaş","Altun"};

        File file=new File("/Users/barisaltun/IdeaProjects/InterviewQuestions/filename.txt");


        try {
            file.createNewFile();
            FileWriter myWriter = new FileWriter( file.getAbsolutePath()            );
          /*  for (String string : strings) {
                myWriter.write(string+"\n");

            }
*/
            myWriter.write("Bilal");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
