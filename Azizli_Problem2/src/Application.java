class Application
{
    public static void main(String[] args)
    {
        String input_file = "problem2.txt";
        String output_file = "unique_word_counts.txt";
        DuplicateCounter dc = new DuplicateCounter();
        dc.count(input_file);

        dc.write(output_file);
    }
}