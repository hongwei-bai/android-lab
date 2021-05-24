package com.hongwei.android_lab.lab.hilt

import android.content.Context
import androidx.room.Room
import com.hongwei.android_lab.lab.room.EventDao
import com.hongwei.android_lab.lab.room.LabDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Provides
    fun provideTeamScheduleDao(database: LabDatabase): EventDao {
        return database.eventDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): LabDatabase {
        return Room.databaseBuilder(
            appContext,
            LabDatabase::class.java,
            "lab_db"
        ).build()
    }
}


