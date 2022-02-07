import java.nio.file.Paths;

/**
 * @author - LeeN
 * PROJECT NAME: JDBCTESTS
 * CREATED ON: Wednesday 02 February 2022 - 7:11 AM
 */
public class IOClass {
    public static void main(String[] args) {
        var	p	=	Paths.get("/mammal/omnivore/raccoon.image");
        System.out.println("Path	is:	"	+	p);
//        for	(int	i	=	0;	i	<	p.getNameCount();	i++)	{
//            System.out.println("			Element	"	+	i	+	"	is:	"	+	p.getName(i));
//        }
        System.out.println();
        System.out.println("subpath(0,3):	"	+	p.subpath(0,	1));
        System.out.println("subpath(1,2):	"	+	p.subpath(1,	2));
        System.out.println("subpath(1,3):	"	+	p.subpath(1,	3));
    }

}
