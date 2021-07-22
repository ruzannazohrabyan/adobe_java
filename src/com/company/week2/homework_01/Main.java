package com.company.week2.homework_01;

public class Main {

    public static void main(String[] args) {
//xndir:
//stexcum eq Person class vorn uni cnndyan millivayrkyan; mi angam e kareli set anel et variablei arjeq@;
//Personn uni tariq@ het veradardznelu method (entadrum enq vor bolor tarinern unen 365 or).
//ete millivayrkayn@ set chen arel tariq@ tuyl chenq talis vor vercnen u print anen; mek el uni name u verj; namei hamar standard getter setter enq avelacnum @ndamen@;
//Main classum el mi qani Person classi object eq sarqum u porcum inchvor baner set anel, tpel

        Person person1 = new Person();
        Person person2 = new Person();

        person1.setAgeMilliseconds(415363256890L);
        person1.setName("Armen");
        System.out.println(person1.personInfo());
        person1.setAgeMilliseconds(515363256890L);
        System.out.println(person1.personInfo());

        person2.setName("Anahit");
        System.out.println(person2.personInfo());


//xndir:
//stexcum eq Sentence class, vor@ ira mej taqun pahac uni String-neri array (max elementneri qanak@ 5),
// method append anunov, vor@ @ndunuma String word u tanum avelacnuma arrayi mej;
//Sentence@ uni naev getValue method vor@ heta talis vorpes mek amboxjakan string arrayi miji worder@ irar kpcrac spacenerov,
//getWordsCount method vor@ cuyca talu te qani barica baxkacac et class@;
        System.out.println();
        Sentence sentence = new Sentence();
        sentence.append("Hello");
        sentence.append("world");
        sentence.append("my");
        sentence.append("name");
        sentence.append("is");
        System.out.println("Words Count: " + sentence.getWordsCount());
        System.out.println(sentence.getValue());
        System.out.println();
        sentence.append("Ruzanna");
        System.out.println("Words Count: " + sentence.getWordsCount());
        System.out.println(sentence.getValue());


    }
}
