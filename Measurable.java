package Exercise10_4;

public interface Measurable {

    double getMeasure();





    static Measurable largest( Measurable[] objects)
    {

        int i=0;
        double  value=0 ;
        int index =0;
        //System.out.println("Obj: " + objects.length);
        for( i=0;i<objects.length;i++)
        {
            if(objects[i].getMeasure()>value)
            {
                value = objects[i].getMeasure();
                index = i;

            }
        }
        return objects[index];
    }
    static Measurable smallest( Measurable[] objects)
    {

        int i=0;
        double  value=objects[0].getMeasure() ;
        int index =0;
        //System.out.println("Obj: " + objects.length);
        for( i=1;i<objects.length;i++)
        {
            if(objects[i].getMeasure()<value)
            {
                value = objects[i].getMeasure();
                index = i;

            }
        }
        return objects[index];
    }
}
