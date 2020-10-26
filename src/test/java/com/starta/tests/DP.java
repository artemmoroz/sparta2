package com.starta.tests;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.List;

public class DP {


    public class Email{
        String email;
        String fio;

        public Email(String email, String fio){
            this.email = email;
            this.fio = fio;
        }

        @Override
        public String toString() {
            return "Email{" +
                    "email='" + email + '\'' +
                    ", fio='" + fio + '\'' +
                    '}';
        }

        public String getEmail() {
            return email;
        }

        public String getFio() {
            return fio;
        }
    }


    @DataProvider(name = "emailProvider")
    public Object[][] emailsProvider(){
        List<Email> emails = Arrays.asList(
                new Email("a@", "Artem"),
                new Email("b@", "Petya"));
        Object[][] aa = new Object[emails.size()][2];
        for (int i = 0; i < emails.size(); i++) {
            Email email = emails.get(i);
            aa[i][0] = email.getEmail();
            aa[i][1] = email.getFio();
        }
        return aa;
    }
}
