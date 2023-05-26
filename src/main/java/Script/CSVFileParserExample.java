package Script;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFileParserExample {
    public static void main(String[] args) throws IOException {
        Path path =Paths.get("src/main/java/Script/scratch.txt");
        ArrayList<RowDto> dtos=parseCsvFile(path);
        boolean a=dtos.get(0).firstValue ==(int) dtos.get(0).firstValue;
        System.out.println(a);
        boolean b=dtos.get(0).thirdValue==(double) dtos.get(0).thirdValue;
        System.out.println(b);


    }
    private  static  ArrayList<RowDto> parseCsvFile(Path path) throws IOException {
        final List<String> lines = Files.readAllLines(path);
        final ArrayList<RowDto>dtos= new ArrayList<>();
        for(String line:lines){
            final String[] split = line.split(",");
            final  RowDto dto = new RowDto(
                    Integer.parseInt(split[0]),
                    split[1],
                    Double.parseDouble(split[2]),
                    Boolean.parseBoolean(split[3])
            );
            dtos.add(dto);
        }
        return dtos;
    }
    static class RowDto{
        int firstValue;
        String secondValue;
        double thirdValue;
        boolean forthValue;

        public RowDto(int firstValue, String secondValue, double thirdValue, boolean forthValue) {
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.thirdValue = thirdValue;
            this.forthValue = forthValue;
        }
    }
}
