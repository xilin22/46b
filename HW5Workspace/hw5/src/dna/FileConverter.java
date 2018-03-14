package dna;

import java.io.*;
import java.util.*;


public class FileConverter 
{
	File fastq;
	File fasta;
	
	public FileConverter(File fastq, File fasta)
	{
		this.fastq = fastq;
		this.fasta = fasta;
	}
	
	
	//
	// Writes a fasta file consisting of conversion of all records from the fastq with
	// sufficient quality and unique defline.
	//
	public void convert() throws IOException
	{
		// Build chain of readers.
		FileReader fr = new FileReader(fastq);
		BufferedReader br = new BufferedReader(fr);
		FastqReader fqr = new FastqReader(br);

		// Build chain of writers.
		FileWriter fw = new FileWriter(fasta);
		PrintWriter pw = new PrintWriter(fw);
		FastaWriter faw = new FastaWriter(pw);
		
		// Read, translate, write.
		while(true)
		{	
			try
			{
				//reads the fastq file and stores it as a FastqRecord objects
				FastqRecord fastqR = fqr.readRecord();  
				
				//checks for the end of file
				if(fastqR == null)  
					break;
				
				if(!fastqR.qualityIsLow())
				{
					//create a new fasta record from the fastq record			
					FastaRecord fastaR = new FastaRecord(fastqR);
					
					//write the fasta record to a new file
					faw.writeRecord(fastaR);  
				}
				
			}
			catch(RecordFormatException x)
			{
				System.out.println(x.getMessage());
			}
		}
		
		// Close fr, br, fw, and pw in reverse order of creation.
		pw.close();
		fw.close();
		br.close();
		fr.close();
	}
	
		
	
	public static void main(String[] args)
	{
		System.out.println("Starting");
		try
		{
			File fastq = new File("data/HW4.fastq");
			if (!fastq.exists())
			{
				System.out.println("Can't find input file " + fastq.getAbsolutePath());
				System.exit(1);
			}
			File fasta = new File("data/HW4.fasta");
			FileConverter converter = new FileConverter(fastq, fasta);
			converter.convert();
		}
		catch (IOException x)
		{
			System.out.println(x.getMessage());
		}
		System.out.println("Done");
	}
}
