package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import controller.Ideia;

public class Usuario {
    
    protected String login;
    protected String senha;
    protected String nome;
    protected int idade;
    protected String sexo;
    protected ArrayList<Ideia> ideiasMinhas;
    protected ArrayList<Ideia> ideias;
    
    public Usuario() {
        ideias = new ArrayList<>();
        ideiasMinhas = new ArrayList<>();
    }
    
    public void setIdeiaMinha(ArrayList<Ideia> ideiasMinhas){
        FileOutputStream fout;
        ObjectOutputStream out;
        
        try {
            fout = new FileOutputStream(this.login + "ideias.txt", false);
            out = new ObjectOutputStream(fout);

            out.writeObject(ideiasMinhas);

            out.close();
            fout.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void setIdeia(ArrayList<Ideia> ideiasMinhas){
         FileOutputStream fout;
        ObjectOutputStream out;
        
        try {
            fout = new FileOutputStream("ideias.txt", false);
            out = new ObjectOutputStream(fout);

            out.writeObject(ideiasMinhas);

            out.close();
            fout.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //public ArrayList<Ideia> lerIdeiasMinhas() {
    //    return ideiasMinhas;
    //}
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public ArrayList<Ideia> lerIdeiasMinha(){
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Ideia> ideiasMinhas = new ArrayList<>();

        try {
            fin = new FileInputStream(this.login +"ideias.txt");
            in = new ObjectInputStream(fin);

            ideiasMinhas = (ArrayList<Ideia>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ideiasMinhas;
    }
    
    public ArrayList<Ideia> lerIdeias(){
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Ideia> ideias = new ArrayList<>();

        try {
            fin = new FileInputStream("ideias.txt");
            in = new ObjectInputStream(fin);

            ideias = (ArrayList<Ideia>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ideias;
    }
    
    
}
