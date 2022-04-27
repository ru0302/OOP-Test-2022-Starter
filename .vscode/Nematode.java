package ie.tudblin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class nematode extends PApplet
{

   void loadNematode()
   Table table = loadTable("nematode.csv", "header");
   for(TableRow r:table.rows())
   {
      Nematode = new nematode'
      Nematode.add(s);
   }

   public void settings() {
      size(800,800);
   }
}