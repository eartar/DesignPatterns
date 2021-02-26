package pattern.decorator;


import lombok.AllArgsConstructor;

interface Present {
    void createWrap(String toyName);

    void readWrap();
}

@AllArgsConstructor
class Gift implements Present {
    private String content;

    @Override
    public void createWrap(String toyName) {
        System.out.println("Creating decorations for the gift");
    }

    @Override
    public void readWrap() {
        System.out.println(content);
    }
}

class GiftDecorator implements Present {

    private Present wrappee;

    public GiftDecorator(Present wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void createWrap(String toyName) {
        wrappee.createWrap(toyName);
    }

    @Override
    public void readWrap() {
        wrappee.readWrap();
    }
}


class Ribbon extends GiftDecorator {

    private String ribbonContent = "blue ribbon";

    public Ribbon(Present wrappee) {
        super(wrappee);
    }

    @Override
    public void createWrap(String toyName) {
        super.createWrap(addRibbon(toyName));
    }

    @Override
    public void readWrap() {
        System.out.println(ribbonContent);
        super.readWrap();
    }

    private String addRibbon(String toyName) {
        toyName += ribbonContent;
        return toyName;
    }
}

class Packaging extends GiftDecorator {

    private String packagingContent = "red packaging";

    public Packaging(Present wrappee) {
        super(wrappee);
    }

    @Override
    public void createWrap(String toyName) {
        super.createWrap(addPackaging(toyName));
    }

    @Override
    public void readWrap() {

        System.out.println(packagingContent);
        super.readWrap();
    }

    private String addPackaging(String toyName) {
        toyName += packagingContent;
        return toyName;
    }
}

public class SolutionDecorator {
    public static void main(String[] args) {
        GiftDecorator present = new Packaging(new Ribbon(new Gift("Wooden Horse Head")));
        present.readWrap();
    }
}