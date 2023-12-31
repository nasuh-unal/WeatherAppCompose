package com.plcoding.weatherapp.di

import com.plcoding.weatherapp.data.location.DefaultLocationTracker
import com.plcoding.weatherapp.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@OptIn(ExperimentalCoroutinesApi::class)
@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {
@Binds
@Singleton
abstract fun bindLoactionTracker(defaultLocationTracker:DefaultLocationTracker):LocationTracker
}