package de.fillikos.rf2.esctool.data.grid.raceresult;

import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXB;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ResultsFactory implements XMLResult {

    private RFactorXML xml;

    public ResultsFactory() {
        super();
    }

    public RFactorXML getResult(Path path) {
        getXMLResult(path);
        return xml;
    }

    @Override
    public void getXMLResult(Path path) {
        try {
            xml = JAXB.unmarshal(path.toFile(), RFactorXML.class);
        } catch (DataBindingException e1) {
            //Todo Fehlerhandling: Fehler beim erstmaligen unmarshal der Result-Datei
            Path tempPath = Paths.get(System.getProperty("java.io.tmpdir") + "result.tmp");
            File tmpFile = tempPath.toFile();
            try {
                tmpFile.createNewFile();
                try (BufferedWriter writer = Files.newBufferedWriter(tempPath, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
                     BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line + "\n");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    //Todo Fehlerhandling: Fehler beim kopieren der Original XML in die Temp-Datei
                }
                xml = JAXB.unmarshal(tempPath.toFile(), RFactorXML.class);
            } catch (IOException e3) {
                e3.printStackTrace();
                //Todo Fehlermeldung, Fehler beim erstellen der Temp-Datei
            }
            try {
                Files.deleteIfExists(tempPath);
            } catch (IOException e4) {
                e4.printStackTrace();
                //Todo Fehlermeldung, Fehler beim löschen der Temp-Datei
            }
        }
    }
}
