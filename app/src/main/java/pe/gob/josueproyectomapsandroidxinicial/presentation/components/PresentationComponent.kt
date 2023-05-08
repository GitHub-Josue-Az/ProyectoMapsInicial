package pe.gob.josueproyectomapsandroidxinicial.presentation.components

import dagger.Component
import pe.gob.josueproyectomapsandroidxinicial.MainActivity
import pe.gob.josueproyectomapsandroidxinicial.presentation.di.PresentationModule

@Component(modules = [PresentationModule::class])
interface PresentationComponent {

    fun inject(activity: MainActivity)
}