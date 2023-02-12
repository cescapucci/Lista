/**
 * @author cesca
 */

public class Lista {

    private Nodo head;

    private int elementi;

    /**
     * costruttore
     */
    public Lista(){
        head = null;
        elementi = 0;
    }

    /**
     * crea un  nodo settando anche il  link
     * @param oggetto
     * @param link
     * @return
     */
    public Nodo creaNodo(int oggetto, Nodo link){
        Nodo nuovoNodo  = new Nodo(oggetto);
        nuovoNodo.setLink(link);
        return nuovoNodo;
    }

    /**
     * get link posizione
     * @param pos
     * @return
     * @throws Exception
     */
    private Nodo getLinkPosizione (int pos) throws ListaException {
        int n = 1;
        Nodo p = head;

        if (head  == null)
            throw new ListaException("lista vuota;");
        if  ((pos > elementi) || pos < 1)
            throw new ListaException("posizione errata");

        while (p.getLink() != null && (n < pos)){
            p = p.getLink();
            n++;
        }
        return p;
    }

    /**
     * inserisci in testa
     * @param info
     */
    public void inserisciInTesta(int info){
        Nodo p = creaNodo(info, head);
        head = p;
        elementi++;
        return;

    }

    /**
     * inserisci in coda
     * @param info int
     * @throws Exception
     */
    public void inserisciInCoda(int info) {
        if  (head ==  null)
            inserisciInTesta(info);
        else{
            try {
                Nodo p = getLinkPosizione(elementi);
                p.setLink(creaNodo(info, null));
                elementi++;
            }
            catch (ListaException exception)
            {}
        return;
        }
    }

    /**
     * elimina  in testa
     * @throws Exception
     */
    public void eliminaInTesta() throws ListaException {
        if  (head == null)
        { throw new ListaException("lista vuota");}
        head = head.getLink();
        elementi --;
    }

    /**
     * elimina in coda
     * @throws Exception
     */
    public void eliminaInCoda () throws ListaException {
        if (head == null)
            throw new ListaException("lista vuota");
        Nodo p = getLinkPosizione(elementi-1);
        p.setLink(null);
        elementi--;
        //return;
    }

    /**
     * elimino tutta la lista
     */
    public void eliminaLista(){
        head = null;
    }

    /**
     * visito
      * @param
     * @return
     */
    /*public String visita (Nodo  p){
        if (p == null)
            return "";
        return  p.getInfo()+ "\n" +visita(p.getLink());
    }

    public String elenco(){
        return  visita(head);
    }

    public String toString(){
        Nodo p = head;
        String lista =new String ("head->");

        if(p == null) return lista + "null";

        while  (p != null){
            lista = lista + "[" + p.getInfo() + "]";
            if (p.getLink() == null)
                lista = lista + "null]->";
            else lista = lista + "+]->";
            p = p.getLink();
        }
        return  lista;
    }*/


    public void  visitsRicorsiva  (){
        Nodo p = head;
        System.out.println("la  lista attuale");
        while (p != null){
            System.out.println(p.getInfo());
            p =  p.getLink();
        }
    System.out.println("\n");
    }

}
