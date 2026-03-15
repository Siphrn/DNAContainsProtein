public class DNA {
  public static void main(String[] args) {

    // Example DNA Seqence.
    String dna = "ATGCGATACGCTTGA";


    // Determines whether the DNA Strand contains a protein.
    if (dna.contains("ATG") && dna.contains("TGA") && dna.length() % 3 == 0) {
      int ATGIndex = dna.indexOf("ATG");
      int TGAIndex = dna.indexOf("TGA");
      System.out.println(dna.substring(ATGIndex, TGAIndex));
      
    } else {
      System.out.println("No protein.");
    }
  }
}
