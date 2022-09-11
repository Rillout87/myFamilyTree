public class Main {
    public static void main(String[] args) {
        Person lena = new Person("Lena", Gender.female);
        Person kirill = new Person("Kirill", Gender.male);
        Person lida = new Person("Lida", Gender.female);
        Person larisa = new Person("Larisa", Gender.female);
        Person timofei = new Person("Timofei", Gender.male);
        Person yuriy = new Person("Yuriy", Gender.male);

        MyFamilyTree gt = new MyFamilyTree();
        gt.relations(yuriy, lena);
        gt.relations(lida, lena);
        gt.relations(lena, timofei);
        gt.relations(larisa, kirill);
        gt.relations(kirill, timofei);


        new Research(gt).familyMembers(lena,
                Relationship.parent);
        new Research(gt).familyMembers(lida,
                Relationship.parent);
        new Research(gt).familyMembers(lena,
                Relationship.children);
        new Research(gt).familyMembers(timofei,
                Relationship.children);
        new Research(gt).familyMembers(kirill,
                Relationship.parent);
        new Research(gt).familyMembers(lena,
                Relationship.parent);

    }
}
