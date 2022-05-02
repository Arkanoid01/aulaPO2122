package org.impl.Tool;

import org.impl.Evaluation.Evaluation;

import java.util.Arrays;
import java.util.List;

public class StartEvaluation {

    public static void main(String[] args){

		System.out.print("Ciao commit!");

        String round = "1";

        List<String> targets = Arrays.asList("junit", "slf4j-api", "log4j", "guava", "commons-io", "httpclient", "commons-lang3");
        //List<String> targets = Arrays.asList("slf4j-api");

        //String folder = prop.getTenEvalFolderBase()+round+"/githubDiffEval/"; //non si deve automatizzare, bisogna cambiare il graph.db per ogni folder
        String folder = "data/evaluation/tenFolder/"+round+"/githubDiffEval/";
        String issueFolder = "data/Utils/Issue_data/";
        String updateLibFile = "data/Utils/libraryVer/ver.csv";

        String outputFolder = "data/evaluation/output/";
		
		System.out.print("Ciao commit!");

        Evaluation.startEvaluation(folder, issueFolder, updateLibFile, round,5, targets, outputFolder);
    }

}
