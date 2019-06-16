package Spring.demo3;

import java.util.List;
import java.util.Map;

/**
 * 依赖注入
 * 集合的注入
 */
public class Student {
    String name;
    List<String> favoriteFoods;
    Map<String, String> relationship;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public Map<String, String> getRelationship() {
        return relationship;
    }

    public void setRelationship(Map<String, String> relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", favoriteFoods=" + favoriteFoods +
                ", relationship=" + relationship +
                '}';
    }
}
