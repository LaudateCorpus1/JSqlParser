/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statements;

import java.io.*;
import java.util.HashMap;

public class Spen {


  static HashMap<String, String> parseQ() {
    HashMap<String, String> strs = new HashMap<>();
    File f = new File("/Users/spencer/repos/chartio/dashboards/nitro-perk-drilldown/gend");
    for (File q : f.listFiles()) {
      if( !q.getName().contains("5208094") ) continue;
      if( q.getName().contains("~") ) continue;
      try (BufferedReader br = new BufferedReader(new FileReader(q))) {
        StringBuilder sb = new StringBuilder();
        String qline;

        while ((qline = br.readLine()) != null) {
          sb.append(qline);
          sb.append('\n');
        }
        String[] ss = sb.toString().split(";");
        if( ss[0].startsWith("SET") )
          strs.put(q.getName(), ss[1]);
        else
          strs.put(q.getName(), sb.toString());
      } catch (IOException ioe) {
        throw new RuntimeException(ioe);
      }
    }
    return strs;
  }


  public static void main(String[] args) throws JSQLParserException {

//    HashMap<String, String> queries = parseQ();
//
//    int i = 1;
//    for(String qn: queries.keySet()) {
//      try {
//        String query = queries.get(qn);
//        Statements stmt = CCJSqlParserUtil.parseStatements(query);
//        System.out.println(stmt);
//      } catch(Exception e) {
//        e.printStackTrace();
//        System.out.println("Failed on number " + qn);
//        System.out.println(queries.get(qn));
//        throw new RuntimeException(e);
//      }
//      i++;
//    }
//
//    System.out.println("All queries parse " + i + ".");

    String q2 = "select foo(arg1, arg2) from bar;"; // bool_or(datediff(days, prior_launch, timestamp) >= 30 OR prior_launch is null) as redeemed_perk from foo p;";
    Statements stmt = CCJSqlParserUtil.parseStatements(q2);
    System.out.println("asdf");
  }
}
