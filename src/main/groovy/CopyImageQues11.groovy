
class CopyImageQues11 {

    static void main(String[] args) {

        def fout = new FileOutputStream("Q11-write.jpg")
        def fin = new FileInputStream("boot1.jpg")
        fin.eachByte { fout.write(it)}
    }

}
