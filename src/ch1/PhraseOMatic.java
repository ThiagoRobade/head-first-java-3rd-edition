package ch1;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"Cloud-native", "AI-powered", "Serverless",
                "High-performance", "Cross-platform", "Real-time", "Scalable",
                "Next-gen", "Open-source", "End-to-end", "Cyber-secure", "Full-stack"};

        String[] wordListTwo = {"optimized", "decentralized", "automated",
                "containerized", "virtualized", "distributed", "orchestrated",
                "integrated", "streamlined", "reactive", "modular", "resilient",
                "encrypted", "stateless", "asynchronous", "event-driven", "native", "reusable"};

        String[] wordListThree = {"architecture", "ecosystem", "framework",
                "pipeline", "infrastructure", "interface", "workflow", "repository",
                "microservice", "protocol", "platform", "lifecycle"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() *oneLength);
        int rand2 = (int) (Math.random() *twoLength);
        int rand3 = (int) (Math.random() *threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Wee need " + phrase);
    }
}
