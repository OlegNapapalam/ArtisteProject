public interface Artiste {

    //Необходимые методы для класификаци Артиста от Человека

    Artiste artiste(boolean isArtiste, String pName, String skill, String typeSkill);

    boolean getIsArtiste();
    String getPenName();
    String getSkill();
    String getTypeSkill();

}
