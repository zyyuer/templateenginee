package cn.tangue.templateenginee.utils;

import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*po和vo转换 po普通对象可以与数据库交互，vo视图对象*/
public class DozerUtils {
    static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List destinationList = new ArrayList();
        for (Iterator i$ = sourceList.iterator(); i$.hasNext(); ) {
            Object sourceObject = i$.next();
            Object destinationObject = mapper.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }
}
