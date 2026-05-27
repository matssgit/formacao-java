package br.com.softhouse;


import br.com.softhouse.m2.User;

public class MinhaClasse {
    static void main(String[] args) {
        br.com.softhouse.model.User user = new br.com.softhouse.model.User();
        user.showMyName();

        User userLocal = new User();
        userLocal.showMyName();
    }
}
