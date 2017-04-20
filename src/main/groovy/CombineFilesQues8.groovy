
class CombineFilesQues8 {

    static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();


        new File("groovyQues8/").eachFile() {

            file -> file.getAbsoluteFile().eachLine {

                    line -> println "line : $line";

                        stringBuilder.append(line+"\n")
                         new File("groovyQues8/output.txt").withWriter('utf-8') {

                            writer -> writer.write(stringBuilder.toString());
                         }
                }
        }
    }
}
