package com.hongwei.android_lab.map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.hongwei.android_lab.databinding.ActivityMainBinding
import com.hongwei.android_lab.map.rx3.Rx3Test

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.mapView.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        viewBinding.mapView.onResume()
        viewBinding.mapView.getMapAsync { googleMap ->
            with(googleMap) {
                val location = LatLng(-33.865143, 151.209900)
                moveCamera(CameraUpdateFactory.newLatLng(location))
                animateCamera(CameraUpdateFactory.newLatLngZoom(location, 12f))
                addMarker(MarkerOptions().position(location))

                // Alternatives - disableAllMapInteractions programmatically.
//                disableAllMapInteractions()
            }
        }

        val html = "<b>Location:</b> Sydney, Australia"
        viewBinding.description.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY)

        Rx3Test().testMergeCompletables()
    }

    private fun GoogleMap.disableAllMapInteractions() {
        this.uiSettings.isScrollGesturesEnabled = false
        this.uiSettings.isZoomGesturesEnabled = false
        this.uiSettings.isTiltGesturesEnabled = false
        this.uiSettings.isRotateGesturesEnabled = false
    }
}