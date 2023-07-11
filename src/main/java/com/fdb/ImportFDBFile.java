package com.fdb;

import java.io.IOException;

public class ImportFDBFile {
	public static void main(String[] args) {

		// provide the path to your shell script
		String scriptPath = "path/to/your/import_data.sh";

		try {
			ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", scriptPath);
			Process process = processBuilder.start();

			int exitCode = process.waitFor();
			if (exitCode == 0) {
				System.out.println("Shell script executed successfully.");
			} else {
				System.err.println("Error occurred while executing the shell script. Exit code: " + exitCode);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}