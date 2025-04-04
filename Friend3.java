package com.javaex.problem06;
public class Friend3{
    private String name;
    private String hp;
    private String school;
    //필요한 메소드 작성
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
    /**
     * @param name
     * @param hp
     * @param school
     */
    public Friend(String name, String hp, String school) {
      this.name = name;
      this.hp = hp;
      this.school = school;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
      this.name = name;
    }
    /**
     * @param hp the hp to set
     */
    public void setHp(String hp) {
      this.hp = hp;
    }
    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
      this.school = school;
    }
    /**
     * 
     */
    public Friend() {
    }
    @Override
    public String toString() {
      return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
    }
    
    
}
