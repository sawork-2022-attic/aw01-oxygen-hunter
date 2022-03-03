package asciiPanel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        AsciiPanel asciiPanel = context.getBean("asciiPanel", AsciiPanel.class);

        String fontName = asciiPanel.getAsciiFont().getFontFilename();
        int height = asciiPanel.getAsciiFont().getHeight();
        int width = asciiPanel.getAsciiFont().getWidth();
        System.out.println("name:" + fontName);
        System.out.println("height:" + height);
        System.out.println("width:" + width);
    }
}