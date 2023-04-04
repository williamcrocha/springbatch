package br.com.williamrocha.importing;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Here the magic begins
 *
 */
@SpringBootApplication
public class ImportingApplication {

	public static void main(String[] args) {
		boolean hasFile=false;
		for (String arg : args) {
			if(arg.startsWith("--file.input=")) {
				try {
					hasFile = new File(arg.split("=")[1]).exists();
				} catch (Exception e) {
				}
			}
		}
		if(!hasFile) {
			System.err.println("Error! File not found");
			System.err.println("");
			System.err.println("Syntax: java -jar importing-0.0.1-SNAPSHOT.jar --file.input=<file name>");
			System.exit(1);
		} else {
			SpringApplication.run(ImportingApplication.class, args);
		}
	}

}
