
class ListClosure {


    static  void findElement() {

       boolean flag =false;

        def ispresent = { ele,id ->

                   if(id==ele)
                           (true)

                             else
                               (false)
        }

        List list=["a","b","c"]

        list.any {

           flag=  ispresent(it,"a")
        }


        if(flag)
             println(true)
        else
            println(false)
    }

    static void main(String[] args) {

        findElement()

    }
}
