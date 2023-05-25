package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    thea thea = new thea();
    celine celine = new celine();
    emlan emlan = new emlan();
    darrel darrel = new darrel();
    jasmine jasmine = new jasmine();


    public void initialize() {

        thea.setAge("19");
        thea.setNickname("Thea");
        thea.setHobbies("playing roblox, watching movies, playing guitar, crocheting");
        thea.setMBTI("INFJ");
        thea.setZodiac("Sagittarius");

        celine.setAge("19");
        celine.setNickname("Celine");
        celine.setHobbies("Designing, sketching, Watch Tiktok");
        celine.setMBTI("ISTJ");
        celine.setZodiac("Sagittarius");

        emlan.setAge("19");
        emlan.setNickname("Cal");
        emlan.setHobbies("Playing Roblox");
        emlan.setMBTI("INFJ");
        emlan.setZodiac("Pisces");

        darrel.setAge("19");
        darrel.setNickname("Darrel");
        darrel.setHobbies("Matulog");
        darrel.setMBTI("ESFP");
        darrel.setZodiac("Cancer");

        jasmine.setAge("20");
        jasmine.setNickname("Jas");
        jasmine.setHobbies("Watching films");
        jasmine.setMBTI("INFP");
        jasmine.setZodiac("Aries");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Here's my fave person #1! She's" + thea.getNickname() + " " + thea.getAge() + " and her hobbies are " + thea.getHobbies() + "." + " Her MBTI is " + thea.getMBTI() + " and is a " + thea.getZodiac());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Here's my fave person #2! She's" + celine.getNickname() + " " + celine.getAge() + " and her hobbies are " + celine.getHobbies() + "." + " Her MBTI is " + celine.getMBTI() + " and is a " + celine.getZodiac());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Here's my fave person #3! He's" + emlan.getNickname() + " " + emlan.getAge() + " and his hobbies are " + emlan.getHobbies() + "." + " His MBTI is " + emlan.getMBTI() + " and is a " + emlan.getZodiac());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Here's my fave person #3! He's" + darrel.getNickname() + " " + darrel.getAge() + " and his hobbies are " + darrel.getHobbies() + "." + " His MBTI is " + darrel.getMBTI() + " and is a " + darrel.getZodiac());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Here's my fave person #2! She's" + jasmine.getNickname() + " " + jasmine.getAge() + " and her hobbies are " + jasmine.getHobbies() + "." + " Her MBTI is " + jasmine.getMBTI() + " and is a " + jasmine.getZodiac());
        }


        alert.showAndWait();

    }
}
