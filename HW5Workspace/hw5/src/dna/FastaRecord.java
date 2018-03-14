package dna;


public class FastaRecord implements DNARecord 
{	
	private String defline;
	private String sequence;
	
	//
	// Add a precondition check: throw RecordGFormatException if the 1st char of the defline is 
	// not '>'. You will have to change the ctor declaration to say that it throws
	// the exception. The exception should contain a useful informative message.
	//
	public FastaRecord(String defline, String sequence) throws RecordFormatException
	{
		if(defline.charAt(0) != '>')
			throw new RecordFormatException("Unexpected begin of defline: got " + defline.charAt(0) + ", expected >");
		
		this.defline =  defline;
		this.sequence = sequence;
	}
	
	
	// Initialize defline and sequence from the input record. The defline should be the
	// defline of the fastq record, but with a '>' in the first position rather than a '@'.
	// If you’re not sure how to do this, look up the substring method on the String API page.
	public FastaRecord(FastqRecord fastqRec)
	{
		defline = fastqRec.getDefline().replaceFirst("@",">");
		sequence = fastqRec.getSequence();
		
	}
	
	

	// 
	// Provide the 2 methods that satisfy the interface.
	//
	public String getDefline()
	{
		return defline;
	}
	
	public String getSequence()
	{
		return sequence;
	}
	
	
	//
	// Provide an equals() method. 
	// Checks for deep equality of deflines and then sequence
	//
	@Override
	public boolean equals(Object x)
	{
		FastaRecord that = (FastaRecord) x;
		if(!this.defline.equals(that.defline))
			return false;
		
		if(!this.sequence.equals(that.sequence))
			return false;
	
		return true;
	}

	
	//
	// Provide a hashCode() method that returns the sum of the hashcodes of 
	// defline and sequence.
	//
	public int hashCode()
	{
		return this.defline.hashCode() + this.sequence.hashCode();
	}
	
}
