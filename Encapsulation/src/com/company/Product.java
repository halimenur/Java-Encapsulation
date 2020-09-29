package com.company;

public class Product {
    //Constructor
    //Bu parametreleri verdiğimizde bu parametreleri vererek kullanmak zorundayız demiş oluruz
    //Bu productı kullanmak için parametre olarak verilen özellikleri this işlemi yapılması gerek
//Aynı isimli ama farklı parametreli metodlar Ovarloading yapılmış olur
    public Product(int _id,String _name,String _description){
        System.out.println("Yapıcı blok çalıştı");

        this._id=_id;
        this._name=_name;
        this._description=_description;
    }
    public Product(){

    }
    //Attribute :field

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockPiece;
    private String _renk;
    private String _kod;
    //Id'yi okuyabilir
    //getter
    public int getId(){
        return _id;
    }
//setter
    public  void setId(int id){
        //this.id=id;
        _id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockPiece() {
        return _stockPiece;
    }

    public void set_stockPiece(int _stockPiece) {
        this._stockPiece = _stockPiece;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    public String get_kod() {
        return _name.substring(0,1)+_id;
    }

    public void set_kod(String _kod) {
        this._kod = _kod;
    }
}
