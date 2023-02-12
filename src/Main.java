/**
 * @author cesca
 */
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello world!");

        //creo delle info
        int info1 = 1;
        int info2 = 2;
        int info3 = 3;
        int info4 = 4;
        int info5 = 5;

        //creo una lista
        Lista list = new Lista();


        //testinserisci in testa/coda
        list.inserisciInTesta(info1);
        //list.inserisciInTesta(info2);
        list.inserisciInTesta(info3);
        list.inserisciInTesta(info4);
        list.inserisciInCoda(info2);

        //test  elimina in coda
        list.visitsRicorsiva();
        try{
            list.eliminaInCoda();
        }
        catch (ListaException exception){
            System.out.println(exception.getError());
        }

        list.inserisciInTesta(info5);
        list.visitsRicorsiva();

        //test  elimina in testa
        try{
            list.eliminaInTesta();
        }
        catch (ListaException exception){
            System.out.println(exception.getError());
        }

        list.visitsRicorsiva();

        //test elimina lista
        list.eliminaLista();
        list.visitsRicorsiva();
    }
}