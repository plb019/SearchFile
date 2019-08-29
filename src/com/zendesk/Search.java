package com.zendesk;

public class Search {
    public static String searchZendesk(){
        /*
        This seems to be the bulk of the task
        connect to JSON somehow :-)
        */
        return ("Select 1) Users or 2) Tickets or 3) Organizations");

      /*Assuming content represents the json string
      JSONObject list = new JSONObject(content).getJSONObject("list");
      JSONArray resources = list.getJSONArray("resources");
      for (int j = 0; j < resources.length(); j++) {
          JSONObject resource =     resources.getJSONObject(j).getJSONObject("resource");
          JSONObject fields = resource.getJSONObject("fields");
          System.out.println(fields.get("symbol"));
          System.out.println(fields.get("price"));
      }*/

    }
}
