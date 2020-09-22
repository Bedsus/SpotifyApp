package ru.bedsus.spotifyapp.modules.search.vm.mappers

import ru.bedsus.core.repository.Mapper
import ru.bedsus.spotifyapp.modules.album.models.SimpleAlbum
import ru.bedsus.spotifyapp.modules.artist.models.Artist
import ru.bedsus.spotifyapp.modules.search.models.SearchType
import ru.bedsus.spotifyapp.modules.search.vm.models.SearchItem

object ArtistToSearchItemMapper : Mapper<Artist, SearchItem> {
    override fun map(input: Artist): SearchItem {
        input.apply {
            return SearchItem(
                    id = id,
                    firstText = name,
                    secondText = null,
                    image = image.url,
                    type = SearchType.ARTIST
            )
        }
    }
}