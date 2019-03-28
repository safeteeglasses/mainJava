<!---------------------------------------------------------------->
<!-- Vue Nested Components - ResultsDisplay.vue - Tutotial Final-->
<!---------------------------------------------------------------->
<template>
    <table v-if="results">
        <tr>
            <th>ID</th>
            <th>Make Name</th>
            <th>Manufacturer's Name</th>
        </tr>
        <tr v-for="result in results.Results">
            <td>{{ result.Make_ID }}</td>
            <td>{{ result.Make_Name }}</td>
            <td>{{ result.Mfr_Name }}</td>
        </tr>
    </table>
</template>

<script>
/**
 * Results display
 */
export default {
    name: 'results-display',
    props: {
        results: Object
    }
}
</script>