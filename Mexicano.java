package Practica4;
import java.util.Scanner;
import java.util.Random;
public class Mexicano {
    public String primernom;
    public String segundonom;
    public String apellidopaterno;
    public String apellidomaterno;
    public String estado;
    public String genero;
    public String dia;
    public String mes;
    public String año;
    public String CURP;
    public String RFC;

    public Mexicano(String primernombre, String segundonombre, String apellidopaterno, String apellidomaterno, String estado, String genero, String dia, String mes, String año, String CURP, String RFC) {
        this.primernom = primernombre;
        this.segundonom= segundonombre;
        this.apellidopaterno=apellidopaterno;
        this.apellidomaterno=apellidomaterno;
        this.estado=estado;
        this.genero=genero  ;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        this.CURP=CURP;
        this.RFC=RFC;
    }

    public void setprimernombre(String primernom){
        this.primernom = primernom;
    }
    public String getprimernombre(){
        return this.primernom;
    }
    public void setsegundonom(String segundonom){
        this.segundonom= segundonom;
    }
    public String getsegundonom(){
        return this.segundonom;
    }
    public void apellidopaterno(String apellidopaterno) {this.apellidopaterno = apellidopaterno;}
    public String getapellidopaterno(){
        return this.apellidopaterno;
    }
    public void apeliidomaterno(String apeliidomaterno){
        this.apellidomaterno = apeliidomaterno;
    }
    public String getapeliidomaterno(){
        return this.apellidomaterno;
    }
    public void estado(String estado){
        this.estado = estado;
    }
    public String getestado(){return this.estado;}
    public void asignarGen(String genero){
        this.genero = genero;
    }
    public String getgenero(){
        return this.genero;
    }
    public void asignarDia(String dia){
        this.dia = dia;
    }
    public String getDia(){
        return this.dia;
    }
    public void asignarMes(String mes){
        this.mes = mes;
    }
    public String getMes(){
        return this.mes;
    }
    public void asignarAño(String año){
        this.año = año;
    }
    public String getAño(){
        return this.año;
    }
    public Mexicano() {
        this.primernom = null;
        this.segundonom=null;
        this.apellidopaterno=null;
        this.apellidomaterno=null;
        this.estado=null;
        this.genero=null;
        this.dia=null;
        this.mes=null;
        this.año=null;
        this.CURP= null;
        this.RFC= null;
    }

    public String getapellidop(){
        String caracter1 = apellidopaterno.toUpperCase();
        for(int i=0; i<caracter1.length(); i++) {
            if(caracter1.substring(i,i+1) != "A"|| caracter1.substring(i,i+1) != "E"|| caracter1.substring(i,i+1) != "I"|| caracter1.substring(i,i+1) != "O"|| caracter1.substring(i,i+1) != "U")
            {caracter1 = caracter1.substring(i,i+1);}
        }
        return caracter1;
    }
    public String apellidoma(){
        String caracter2 = apellidomaterno.toUpperCase();
        for(int i=0; i<caracter2.length(); i++) {
            if(caracter2.substring(i,i+1) != "A"|| caracter2.substring(i,i+1) != "E"|| caracter2.substring(i,i+1) != "I"|| caracter2.substring(i,i+1) != "O"|| caracter2.substring(i,i+1) != "U")
            {caracter2 = caracter2.substring(i,i+1);}}
        return caracter2;
    }

    public String primernombre(){
        String caracter3 = primernom.toUpperCase();
        for(int i=0; i<caracter3.length(); i++) {
            if(caracter3.substring(i,i+1) != "A"|| caracter3.substring(i,i+1) != "E"|| caracter3.substring(i,i+1) != "I"|| caracter3.substring(i,i+1) != "O"|| caracter3.substring(i,i+1) != "U")
            {caracter3 = caracter3.substring(i,i+1);}
        }
        return caracter3;
    }
    public String segundonombre(){
        String caracter4 = segundonom.toUpperCase();
        for(int i=0; i<caracter4.length(); i++) {
            if(caracter4.substring(i,i+1) != "A"|| caracter4.substring(i,i+1) != "E"|| caracter4.substring(i,i+1) != "I"|| caracter4.substring(i,i+1) != "O"|| caracter4.substring(i,i+1) != "U")
            {caracter4 = caracter4.substring(i,i+1);}
        }
        return caracter4;
    }

    public String getRandom(){
        char [] chars = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        int charsLength = chars.length;
        Random random = new Random();
        char instancia = (chars[random.nextInt(charsLength)]);
        String random1 = String.valueOf(instancia);
        return random1;
    }
    public String getestados(){
        String Estado = this.estado.toUpperCase();
        if(Estado == "AGUASCALIENTES"){Estado = "AS";}
        if(Estado == "BAJA CALIFORNIA SUR"){Estado = "BS";}
        if(Estado == "COAHUILA"){Estado = "CL";}
        if(Estado == "CHIAPAS"){Estado = "CS";}
        if(Estado == "DISTRITO FEDERAL"){Estado = "DF";}
        if(Estado == "GUANAJUATO"){Estado = "GT";}
        if(Estado == "HIDALGO"){Estado = "HG";}
        if(Estado == "MÉXICO" || Estado == "MEXICO"){Estado = "MC";}
        if(Estado == "MORELOS"){Estado = "MS";}
        if(Estado == "NUEVO LEÓN" || Estado == "NUEVO LEON"){Estado = "NL";}
        if(Estado == "PUEBLA"){Estado = "OL";}
        if(Estado== "QUINTANA ROO"){Estado = "QR";}
        if(Estado == "SINALOA"){Estado = "SL";}
        if(Estado == "TLAXCALA"){Estado = "TL";}
        if(Estado == "YUCATAN" || Estado == "YUCATAN"){Estado = "YN";}
        if(Estado  == "BAJA CALIFORNIA"){Estado  = "BC";}
        if(Estado  == "CAMPECHE"){Estado  = "CC";}
        if(Estado  == "COLIMA"){Estado  = "CM";}
        if(Estado == "CHIHUAHUA"){Estado  = "CH";}
        if(Estado  == "DURANGO"){Estado  = "DG";}
        if(Estado  == "GUERRERO"){Estado  = "GR";}
        if(Estado  == "JALISCO"){Estado  = "JC";}
        if(Estado  == "MICHOACÁN" || Estado  == "MICHOACAN"){Estado  = "MN";}
        if(Estado  == "NAYARIT"){Estado  = "NT";}
        if(Estado  == "OAXACA"){Estado  = "OC";}
        if(Estado  == "QUERÉTARO" || Estado  == "QUERETARO"){Estado  = "QT";}
        if(Estado  == "SAN LUIS POTOSÍ" || Estado  == "SAN LUIS POTOSI"){Estado  = "SP";}
        if(Estado  == "SONORA"){Estado  = "SR";}
        if(Estado  == "TAMAULIPAS"){Estado  = "TS";}
        if(Estado  == "VERACRUZ"){Estado  = "VZ";}
        if(Estado  == "ZACATECAS"){Estado  = "ZS";}
        if(Estado  == "NACIDO EN EL EXTRANJERO"){Estado  = "NE";}
        return estado ;
    }
    public void Curp(String primernom, String segundonom, String apellidop, String apellidom, String genero, String estado, String dia, String mes, String año){
        String primernom1,primernom2,segundonom1,segundonom2,apellidop1,apellidop2,apellidom1,apellidom2,genero1, estado1,estado2, dia1,dia2, mes1,mes2, año1, año2,rad1,rad2;
        apellidop1 = apellidopaterno.substring(0,2);
        apellidom1 = apellidomaterno.substring(0,1);
        primernom1 = primernom.substring(0,1);
        año1 = año.substring(2,3);
        año2 = año.substring(3,4);
        mes1 = mes.substring(0,1);
        mes2 = mes.substring(1,2);
        dia1 = dia.substring(0,1);
        dia2 = dia.substring(1,2);
        genero1 = genero.substring(0,1);
        estado1 = getestados().substring(0,1);
        estado2 = getestados().substring(1,2);
        apellidop2 = getapellidop();
        apellidom2 = apellidoma();
        primernom2 = primernombre();
        rad1 = getRandom();
        rad2 = getRandom();
        this.CURP = apellidop1 + apellidom1 + primernom1 + año1 + año2 + mes1 + mes2 + dia1 + dia1 + genero1 + estado1 + estado2 + apellidop2 + apellidom2 + primernom2 + rad1 + rad2;
        this.CURP = CURP.toUpperCase();
        System.out.println("CURP:"+CURP);
    }
    public void RFC(String primernom, String segundonomb, String apellidop, String apellidom, String genero, String estado, String dia, String mes, String año){
        String RFC, random1, random2, random3;
        random1 = getRandom();
        random2 = getRandom();
        random3 = getRandom();
        RFC = this.CURP.substring(0,9) + random1 + random2 + random3;
        System.out.println("RFC"+RFC);
    }
}

