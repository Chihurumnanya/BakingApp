package com.example.chihurmnanyanwanevu.bakingapp.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;

import com.example.chihurmnanyanwanevu.bakingapp.data.models.Recipe;
import com.example.chihurmnanyanwanevu.bakingapp.utils.PrefsUtils;

public class RecipeWidgetService extends RemoteViewsService {

    public static void updateWidget(Context context, Recipe recipe) {
        PrefsUtils.saveRecipe(context, recipe);

        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, RecipeWidgetProvider.class));
        RecipeWidgetProvider.updateAppWidgets(context, appWidgetManager, appWidgetIds);
    }

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);

        return new com.example.chihurmnanyanwanevu.bakingapp.widget.RemoteViewsFactory(getApplicationContext());
    }
}
