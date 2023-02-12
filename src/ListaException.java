public class ListaException extends Exception{
    private  String error="";

     ListaException(String error){
        this.error =error;
     }

     String getError(){
         return error;
     }
}
