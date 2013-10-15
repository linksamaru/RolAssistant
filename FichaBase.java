package asistenterol;

/**
 *
 * @author Linksamaru
 * @version 2.0
 *  MIT licensed
 */
//la version 1.0 fue con AWT mientras q la 2.0 con SWING
public class fichaBase {
    public int STR;
    public int INT;
    public int RES;
    public int DEX;
    public int PER;
    public int lvl;
    public float exp;
    public String nombre;
    public String campaña;
    public String Master;
    public String clase;
    public String raza;
    public Item[] equipo;
    public Habilidades[] habilidades;
    public Dotes[] dotes;

    private int vida;
    private int iniciativa;
    private int DefArm;
    private int DefDesa;
    private int DefMag;

    public fichaBase(int st,int i,int r,int d,int p,int l,int e,String n,String c,String m){
        this.DEX=d;
        this.INT=i;
        this.Master=m;
        this.PER=p;
        this.STR=st;
        this.RES=r;
        this.campaña=c;
        this.exp=e;
        this.lvl=l;
        this.nombre=n;
        this.CalcularDefensas();
        this.CalcularIniciativa();
        this.CalcularVida();
    }
    private void CalcularVida(){
        this.vida=this.RES*4;
    }
    private void CalcularIniciativa(){
        this.iniciativa=this.DEX+this.PER;
    }
    private void CalcularDefensas(){
        this.DefArm=this.habilidades[0].rango()+5;
        this.DefDesa=this.habilidades[1].rango()+5;
        this.DefMag=this.RES+this.habilidades[2].rango();
    }
    public void addEquipo(Item e){
        int i;
        i=this.equipo.length;
        this.equipo[i+1]=e;
    }
    public void addHab (Habilidades h){
        int i;
        i=this.habilidades.length;
        this.habilidades[i+1]=h;
    }
    public void addDot (Dotes d){
        int i;
        i=this.dotes.length;
        this.dotes[i+1]=d;
    }
}
//Dotes
class Dotes{
    public int costo;
    public int bonif;
    public String nombre;
    public String descripcion;
    public Dotes (int c,int r,String n,String d){
        this.costo=c;
        this.nombre=n;
        this.bonif=r;
        this.descripcion=d;
    }
    public void getDesc(){
    	System.out.println(""+this.descripcion+"");
    }
    public void getRango(){
        System.out.println(""+this.bonif+"");
    }
}
//Equipo
class Item{
    public String nombre;
    public String descripcion;
    public float costo;//en monedas de oro u otro credito
    public int posibleBonificacion;
    public Item(String n,String d,float c,int b){
        this.costo=c;
        this.descripcion=d;
        this.nombre=n;
        this.posibleBonificacion=b;
    }
}
