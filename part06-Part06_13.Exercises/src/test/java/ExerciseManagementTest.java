import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    private ArrayList<String> exercises;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
        exercises = management.exerciseList();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, exercises.size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Hello world");
        assertEquals(1, management.getExercises().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
}
