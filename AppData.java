import java.util.Arrays;

public class AppData {
    private String[] headers;
    private int[][] data;

    public AppData() {}
    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    @Override
    public String toString() {
        return toCsv();
    }
    
    public String toCsv() {
        String[] rows = new String[1 + data.length];
        
        rows[0] = String.join(";", headers);
        
        for(int i = 0; i < data.length; ++i) {
            String[] values = new String[data[i].length];
            for(int j = 0; j < data[i].length; ++j) {
                values[j] = Integer.toString(data[i][j]);
            }
            
            rows[1 + i] = String.join(";", values);
        }
        
        return String.join("\n", rows);
    }
    
    public void fromCsv(String csv_data) throws Exception {
        String[] rows = csv_data.split("\n");
        if(rows.length == 0) {
            throw new Exception("Not enough data in string");
        }
        
        headers = rows[0].split(";");
        for(int i = 0; i < headers.length; ++i) {
            headers[i] = headers[i].trim();
        }
        
        data = new int[rows.length - 1][headers.length];
        for(int i = 1; i < rows.length; ++i) {
            String[] row = rows[i].split(";");
            if(row.length != headers.length) {
                throw new Exception("Row length does not match headers");
            }
            
            for(int j = 0; j < row.length; ++j) {
                data[i - 1][j] = Integer.parseInt(row[j].trim());
            }
        }
    }
}
