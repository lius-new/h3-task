<template>
  <Layout>
    <div class="page-content">
      <Table :func="getAllCar" />
    </div>
  </Layout>
</template>

<script setup lang="ts">
import { getAllCar } from "@/serve/api";
import Layout from "@/components/layout/index.vue";
import Table from "@/components/table-car/index.vue";
</script>

<style scoped>
.page-content {
  padding: 20px;
}
</style>
