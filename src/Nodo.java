/**
 * @author cesca
 */
public class Nodo {
    //attributi
    private int info;
    private  Nodo link;

    /**
     * costruttore
     * @param oggetto
     */
    public Nodo (int oggetto){
        info = oggetto;
        link = null;
    }



    //getter/setter
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    /**
     * per visualizzare il contenutoinformativo
     * di un nodo
     * @return
     */
    public int visualizza() {
        return getInfo();
    }

}
