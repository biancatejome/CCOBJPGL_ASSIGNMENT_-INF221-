package model;

class Classmate {

    private String age;
    private String hobbies;
    private String MBTI;
    private String zodiac;
    private String nickname;

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHobbies() {
        return this.hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public String getMBTI() {
        return this.MBTI;
    }

    public void setMBTI(String MBTI) {
        this.MBTI = MBTI;
    }
    public String getZodiac() {
        return this.zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }
}