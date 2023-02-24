package com.app.bookmyshow.services;

import com.app.bookmyshow.models.Multiplex;
import com.app.bookmyshow.models.Screen;

import java.util.List;

public interface ScreenService {
    Screen addScreen(Screen screen);
    List<Screen> getAllScreen();
    Screen getScreenById(Long screenId);
    Screen deleteScreen(Long screenId);
}
