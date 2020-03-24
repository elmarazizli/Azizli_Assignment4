class Application {
    public static void main(String[] args) {

        DuplicateRemover dp = new DuplicateRemover();

        dp.remove("files/problem1.txt");
        dp.write("files/unique_words.txt");

    }
}