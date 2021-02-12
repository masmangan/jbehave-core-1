package org.jbehave.core.junit.story;

import java.util.Collections;

import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnit4StoryRunner;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.junit.steps.ExampleSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

@RunWith(JUnit4StoryRunner.class)
public class ShowIgnoredScenariosAsIgnoredAndNotPassedStory extends JUnitStory {

    public ShowIgnoredScenariosAsIgnoredAndNotPassedStory() {
        useConfiguration(new MostUsefulConfiguration());
        JUnit4StoryRunner.recommendedControls(configuredEmbedder());
        configuredEmbedder().useMetaFilters(Collections.singletonList("-skip"));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ExampleSteps());
    }
}
