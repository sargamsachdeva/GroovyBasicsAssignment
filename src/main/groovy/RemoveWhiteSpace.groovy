
class RemoveWhiteSpace {

    static void removeWhiteSpaces() {

        StringBuilder stringBuilder = new StringBuilder();

        new File("test.txt").eachLine{
            line -> println "line : $line";

               stringBuilder.append(line+"\n");

                def str = stringBuilder.replaceAll("\\s","");

                new File("impQues9.txt").withWriter('utf-8') {

                    writer -> writer.write(str);
               }
        }
    }

    public static void main(String[] args) {

        removeWhiteSpaces();
    }
}
